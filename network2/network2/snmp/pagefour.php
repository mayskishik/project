<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TCP</title>
    <style>
        body, html {
            margin: 0;
            padding: 0;
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
            background-color: #ffffff;
        }

        tr:hover {
            background-color: #ddd; 
        }

        label {
            color: aliceblue;
        }
    </style>
</head>

<body style="background-image: url(white.jpg);">

<header>
    <h1>TCP Table</h1>
</header>

<ul class="nav-area">
    <li><a href="pageone.php">System Group</a></li>
    <li><a href="pagetow.php">UDP Table</a></li>
    <li><a href="pagethree.php">ARP Table</a></li>
    <li><a href="pagefour.php">TCP Table</a></li>
</ul>

<section>
    <!-- TCP Table -->
    <h2 align="center" style="color: white; font-family:'Comic Sans MS' ">TCP Table</h2>

    <table>
        <tr>
            <th>index</th>
            <th>tcpConnState</th>
            <th>tcpConnLocalAddress</th>
            <th>tcpConnLocalPort</th>
            <th>tcpConnRemAddress</th>
        </tr>

        <?php
        $ip = "127.0.0.1:161";

        $tcpConnState = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.1");
        $tcpConnLocalAddress = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.2");
        $tcpConnLocalPort = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.3");
        $tcpConnRemAddress = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.4");

        for ($i = 0; $i < count($tcpConnState); $i++) {
            ?>
            <tr>
                <td style='color:#090909; font-size: 15px; text-align:center;'><?php echo $i ?></td>
                <td><h6 style='color:#090909; font-size: 12px;'><?php echo $tcpConnState[$i] ?></h6></td>
                <td><h6 style='color:#090909; font-size: 12px;'><?php echo $tcpConnLocalAddress[$i] ?></h6></td>
                <td><h6 style='color:#090909; font-size: 12px;'><?php echo $tcpConnLocalPort[$i] ?></h6></td>
                <td><h6 style='color:#090909; font-size: 12px;'><?php echo $tcpConnRemAddress[$i] ?></h6></td>
            </tr>
            <?php
        }
        ?>
    </table>
</section>

</body>

</html>
