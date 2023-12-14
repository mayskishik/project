<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="stylepage.css" />
    <title> SNMP Manager </title>
</head>
<body>
<button class="tablink" onclick="openPage('SNMP', this, 'PINK')" id="defaultOpen"> SNMP manager</button>
<button class="tablink" onclick="openPage('System', this, 'rgb(157,199,161)')" >System Group</button>
<button class="tablink" onclick="openPage('UDP', this, 'rgb(250,220,187)')" >UPD Table</button>
<button class="tablink" onclick="openPage('ARP', this, 'rgb(178,237,236)')">ARP Table</button>
<button class="tablink" onclick="openPage('TCP', this, 'rgb(223,190,237)')">TCB Table</button>

<div id="SNMP" class="tabcontent">
    <h1>SNMP Manager ( Simple Network Management Protocol )</h1>
    <h1> Made By : Mays ismael And Marah Hanini</h1>
</div>
<div id="System" class="tabcontent">
    <h1> System Group : </h1> <br/>
    <form action="part1.php" method="post">
        <div style="position: relative; width: 100% ; padding:10px;">
            <label style=" width: 100px;"> Name : </label>
            <input style=" width: 500px;" name="name" type="text" placeholder="Enter a new Name">
        </div>
        <div style="position: relative; width: 100% ;padding:10px;">
            <label style=" width: 100px;"> Location : </label>
            <input style=" width: 500px;" name="location" type="text" placeholder="Enter a new location">
        </div>
        <div style="position: relative; width: 100% ;padding:10px;">
            <label  style=" width: 100px;" for="contact"> Contact : </label>
            <input  style=" width: 500px;" name="contact" type="text" placeholder="Enter a new Contact">
        </div>
        <div style="position: relative; width: 100% ;padding:10px;">
            <input style="width: 100px; background-color: lightpink" type="submit" name= "update" value="update">
        </div>
    </form>

    <table>
        <thead>
        <tr>
            <th>System description</th>
            <th>Object ID</th>
            <th>Up time</th>
            <th>Name</th>
            <th>Contact</th>
            <th>Location</th>
        </tr>
        </thead>
      <tr>
            <?php
            $ip = "127.0.0.1:161";
            $dis= snmp2_get($ip,"public",".1.3.6.1.2.1.1.1.0"). "<br>";//discrbtion ;;
            $id_s= snmp2_get($ip,"public",".1.3.6.1.2.1.1.2.0"). "<br>";//obj id   ;;
            $time_s= snmp2_get($ip,"public",".1.3.6.1.2.1.1.3.0"). "<br>";//up time ''
            $contact=snmp2_get($ip,"public",".1.3.6.1.2.1.1.4.0")."<br>";
            $name_s= snmp2_get($ip,"public",".1.3.6.1.2.1.1.5.0")."<br>";//name ''
            $location=snmp2_get($ip,"public",".1.3.6.1.2.1.1.6.0")."<br>";
            if (isset($_POST['update']))
            {
                $location = $_POST['location'];
                $contact = $_POST['contact'];
                $name_s = $_POST['name'];
                snmp2_set("localhost","public","1.3.6.1.2.1.1.5.0","s",$_POST['name']);
                snmp2_set("localhost","public","1.3.6.1.2.1.1.6.0","s",$_POST['location']);
                snmp2_set("localhost","public","1.3.6.1.2.1.1.4.0","s",$_POST['contact']);
            }
            ?>
            <td><?php echo $dis?> </td>
            <td><?php echo $id_s?></td>
            <td><?php echo $time_s?></td>
            <td><?php echo $name_s?></td>
            <td><?php echo $contact?></td>
            <td><?php echo $location?> </td>
        </tr>
    </table>
</div>

<div id="UDP" class="tabcontent">
        <?php
        $ip= "127.0.0.1";
        $ip_addr_table = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20");
        $IpAdEntAddr = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.1");
        $IpAdEnIfIndex = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.2");
        $ipEntNetMask = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.3");
        $ipAdEntBcastAddr = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.4");
        $ipAdEntReasmMaxSize = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.5");
        $i=0;

        echo "<h1> IP Address Table : </h1> <br/>";
        echo "<table>";
        echo
        "
                <thead>
                    <tr>
                        <th>Index</th>
                        <th>IpAdEntAddr</th>
                        <th>IpAdEnIfIndex</th>
                        <th>ipEntNetMask</th>
                        <th>ipAdEntBcastAddr</th>
                        <th>ipAdEntReasmMaxSize</th>
                    </tr>
                </thead>";
        foreach($IpAdEntAddr as $obj){
            echo
                "
                <tr>
                    <td>".$i."</td>
                    <td>".$IpAdEntAddr[$i]."</td>
                    <td>".$IpAdEnIfIndex[$i]."</td>
                    <td>".$ipEntNetMask[$i]."</td>
                    <td>".$ipAdEntBcastAddr[$i]."</td>
                    <td>".$ipAdEntReasmMaxSize[$i]."</td>
                </tr>
            ";
            $i++;
        }
        echo "</table>";

        $net_to_media= snmp2_walk($ip,"public",".1.3.6.1.2.1.4.22");
        $ipNetToMediaIfIndex = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.22.1.1");
        $ipNetToMediaPhysAddress = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.22.1.2");
        $ipNetToMediaNetAddress = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.22.1.3");
        $ipNetToMediaType = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.22.1.4");

        echo "<br/> <h1> Network To Media Table : </h1> <br/>";
        echo "<table>";
        echo
        "
                <thead>
                    <tr>
                        <th>Index</th>
                        <th>ipNetToMediaIfIndex</th>
                        <th>ipNetToMediaPhysAddress</th>
                        <th>ipNetToMediaNetAddress</th>
                        <th>ipNetToMediaType</th>
                    </tr>
                </thead>";
        for($i = 0; $i < count($ipNetToMediaPhysAddress); $i++)
        {
            echo
                "
                <tr>
                    <td>".$i."</td>
                    <td>".$ipNetToMediaIfIndex[$i]."</td>
                    <td>".$ipNetToMediaPhysAddress[$i]."</td>
                    <td>".$ipNetToMediaNetAddress[$i]."</td>
                    <td>".$ipNetToMediaType[$i]."</td>
                </tr>
            ";
            $i++;
        }
        echo "</table>";

        ?>
</div>

<div id="ARP" class="tabcontent">
    <h1> ARP Table : </h1> <br/>
      <?php
      $ip = "127.0.0.1:161";
      $a = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.2");
      $b = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.3");
      $c = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.4");
      $i =0;
      echo"<table>";
      echo "<tr> 
                <th> Index </th>
                <th> Mac </th>
                <th> IP </th>
                <th> type </th>
                </tr>";
      foreach ($a as $k=>$val) {
          echo "<tr> <td> $i </td><td> $a[$i] </td> <td> $b[$i] </td><td> $c[$i] </td>  </tr>";
          $i++;
      }
      echo"</table>";
      ?>
</div>

<div id="TCP" class="tabcontent">
    <h1>  tcpConnTable : </h1> <br/>
    <table>
    <tr >
        <th >index</th>
        <th>tcpConnState</th>
        <th>tcpConnLocalAddress</th>
        <th>tcpConnLocalPort</th>
        <th>tcpConnRemAddress</th>
    </tr>
    <?php
    $ip = "127.0.0.1:161";
    $tcpConnState = snmp2_walk("127.0.0.1", "public", ".1.3.6.1.2.1.6.13.1.1");
    $tcpConnLocalAddress= snmp2_walk("127.0.0.1", "public", ".1.3.6.1.2.1.6.13.1.2");
    $tcpConnLocalPort = snmp2_walk("127.0.0.1", "public", ".1.3.6.1.2.1.6.13.1.3");
    $tcpConnRemAddress= snmp2_walk("127.0.0.1", "public", ".1.3.6.1.2.1.6.13.1.4");
    for($i = 0; $i < count($tcpConnState); $i++)
    {
        echo "<tr>
            <td>".$i."</td>
            <td> ".$tcpConnState[$i]."</td>
            <td> ".$tcpConnLocalAddress[$i]."</td>
            <td> ".$tcpConnLocalPort[$i]."</td>
            <td> ".$tcpConnRemAddress[$i]."</td>
        </tr> ";
    }
    ?>
    </table>
</div>

<script src="javascript.js"></script>

</body>
</html> 