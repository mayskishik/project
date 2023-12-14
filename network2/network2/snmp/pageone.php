<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>System Group</title>
    <style>
        body {
            font-family: 'ui-rounded', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f8f8;
            color: #333;
        }

        header {
            background-color: #a95f5f;
            padding: 20px;
            text-align: center;
            color: #fff;
        }

        .nav-area {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
            background-color: #090909;
        }

        .nav-area li {
            margin: 0;
        }

        .nav-area li a {
            display: block;
            padding: 15px 20px;
            text-decoration: none;
            color: #fff;
            transition: background-color 0.3s;
        }

        .nav-area li a:hover {
            background-color: #555;
        }

        section {
            padding: 20px;
        }

        footer {
            background-color: #a95f5f;
            padding: 10px;
            text-align: center;
            color: #fff;
        }

        section {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        form {
            margin-top: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 15px;
            text-align: left;
        }

        th {
            background-color: #a95f5f;
            color: #fff;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #a95f5f;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #a95f5f;
        }
    </style>
</head>
<body>

<header>
    <h1>System Group</h1>
</header>

<ul class="nav-area">
    <li><a href="pageone.php">System Group</a></li>
    <li><a href="pagetow.php">UDP Table</a></li>
    <li><a href="pagethree.php">ARP Table</a></li>
    <li><a href="pagefour.php">Tcp Table</a></li>
</ul>

<section>
    <div>
        <?php
        $ip = "127.0.0.1:161";
        $dis= snmp2_get($ip,"public",".1.3.6.1.2.1.1.1.0"). "<br>";//discrbtion ;;
        $id_s= snmp2_get($ip,"public",".1.3.6.1.2.1.1.2.0"). "<br>";//obj id   ;;
        $time_s= snmp2_get($ip,"public",".1.3.6.1.2.1.1.3.0"). "<br>";
        $contact=snmp2_get($ip,"public",".1.3.6.1.2.1.1.4.0")."<br>";
        $name_s= snmp2_get($ip,"public",".1.3.6.1.2.1.1.5.0")."<br>";//name ''
        $location=snmp2_get($ip,"public",".1.3.6.1.2.1.1.6.0")."<br>";
        if (isset($_POST['update1']))
        {
            $location = $_POST['loc'];
            snmp2_set("localhost","public","1.3.6.1.2.1.1.6.0","s",$_POST['loc']);
            $contact = $_POST['con'];
            snmp2_set("localhost","public","1.3.6.1.2.1.1.4.0","s",$_POST['con']);
            $name_s = $_POST['name'];
            snmp2_set("localhost","public","1.3.6.1.2.1.1.5.0","s",$_POST['name']);
        }

        ?>

        <h3 ><?php echo "SysDescription :". $dis."\n"?></h3>
        <h3 ><?php echo "SysObjectID: ".$id_s?></h3>
        <h3><?php echo "SysUpTime: ".$time_s?></h3>
        <h3 ><?php echo "SysContact: ".$contact?></h3>
        <h3 ><?php echo "SysName: ".$name_s?></h3>
        <h3><?php echo "Syslocation: ".$location?></h3>

        <h2> Please Change that :-( System_Group_contact):  </h2>

        <form action="pageone.php" method="post">
            <table>
                <tr>
                    <th><label for="con">System_Contact</label></th>
                    <td><input type="text" id="con" name="con"></td>
                </tr>

                <tr>
                    <td></td>
                </tr>
            </table>

            <h2  >Please Change that :-( System_Group_Name): </h2>
            <table>
                <tr>
                    <th><label for="name">System_name</label></th>
                    <td><input type="text" id="name" name="name"></td>
                </tr>

                <tr>
                    <td></td>
                </tr>
            </table>

            <h2 > Please Change that :- ( System_Group_location): </h2>
            <table>
                <tr>
                    <th><label for="loc">System_location</label></th>
                    <td><input type="text" id="loc" name="loc"></td>
                </tr>

                <tr>
                    <td></td>
                    <td><input  type="submit" name= "update1" value="update1"></td>

                </tr>
            </table>
        </form>
    </div>
</section>

<footer>
    <p>Moheeb && Haneen </p>
</footer>

</body>
</html>
