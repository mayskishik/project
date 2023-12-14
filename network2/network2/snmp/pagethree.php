\<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ARP table</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url(white.jpg);
        }

        header {
            width: 100%;
            height: 70px;
            background-color: #a95f5f;
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 2%;
        }

        h1, h6 {
            margin: 0;
            color: whitesmoke;
        }

        h2, h3 {
            color: white;
            margin-top: 20px;
        }

        ul {
            list-style: none;
            margin: 0;
            padding: 0;
            background-color: #090909;
            display: flex;
            justify-content: center;
        }

        li {
            display: inline-block;
            padding: 15px 30px;
        }

        a {
            text-align: center;
            color: #ffffff;
            text-decoration: none;
            font-size: 1.2vw;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            overflow-x: auto;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border: 1px solid #ddd;
        }

        th {
            background-color: #a95f5f;
            color: white;
        }

        tr {
            background-color: #f5f5f5;
        }

        tr:hover {
            background-color: #ddd;
        }

        label {
            color: aliceblue;
        }
    </style>
</head>

<body>

<header>
    <h1>ARP table</h1>
</header>

<ul class="nav-area">
    <li><a href="pageone.php">System Group</a></li>
    <li><a href="pagetow.php">UDP Table</a></li>
    <li><a href="pagethree.php">ARP Table</a></li>
    <li><a href="pagefour.php">TCP Table</a></li>
</ul>

<section>
    <!-- ARP Table -->
    <h2 align="center" style="color: white; font-family:'Comic Sans MS' ">ARP Table</h2>

    <?php
    $ip = "127.0.0.1:161";
    $a = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.2");
    $b = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.3");
    $c = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.4");

    echo '<table>';
    echo '<tr><th>Index</th><th>Mac</th><th>IP</th><th>Type</th></tr>';
    foreach ($a as $i => $val) {
        echo "<tr><td>$i</td><td>$a[$i]</td><td>$b[$i]</td><td>$c[$i]</td></tr>";
    }
    echo '</table>';
    ?>

    <!-- SNMP System Information -->
    <h2 align="center" style="color: white; font-family:'Comic Sans MS' ">SNMP System Information</h2>

    <?php
    $sysName = snmp2_get($ip, "public", ".1.3.6.1.2.1.1.1.0");
    $sysLocation = snmp2_get($ip, "public", ".1.3.6.1.2.1.1.6.0");
    $sysContact = snmp2_get($ip, "public", ".1.3.6.1.2.1.1.4.0");

    echo '<table>';
    echo "<tr><th>System Name</th><td>$sysName</td></tr>";
    echo "<tr><th>System Location</th><td>$sysLocation</td></tr>";
    echo "<tr><th>System Contact</th><td>$sysContact</td></tr>";
    echo '</table>';
    ?>
</section>

</body>

</html>
