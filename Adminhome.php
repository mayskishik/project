<?php

if(isset($_POST['BUTTON1'])) {
    if (!empty($_POST['TX1']) && !empty($_POST['TX2'])){
        $emailsd=$_POST['TX1'];
        $passd=$_POST['TX2'];
        @$dp = new mysqli('localhost', 'root', '', 'newdb');
        if (mysqli_connect_errno()) {
            echo "Error in connection with data base";
            die();
        }
        $strQry = "insert into admins values ('".$emailsd."','".$passd."')";
        $res = $dp->query($strQry);
        echo "<script>alert('Insert sucessfuly..!')</script>";
        echo "<script>window.location='Adminhome.php'</script>";
    }
    else {
        echo "<script>alert('Write all information..!')</script>";
        echo "<script>window.location='Adminhome.php'</script>";
    }


}


else if(isset($_POST['BUTTON2'])) {
    if (!empty($_POST['TX1']) ){
        $emailsd=$_POST['TX1'];

        @$dp = new mysqli('localhost', 'root', '', 'newdb');
        if (mysqli_connect_errno()) {
            echo "Error in connection with data base";
            die();
        }
        $strQry = "delete from admins where Email='$emailsd'";;
        $res = $dp->query($strQry);
        echo "<script>alert('deleted sucessfuly..!')</script>";
        echo "<script>window.location='Adminhome.php'</script>";
    }
    else {
        echo "<script>alert('Write Email first..!')</script>";
        echo "<script>window.location='Adminhome.php'</script>";
    }


}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        .box{

            width: 1200px;
            float: right;
            border: 1px;
            font-size: 20px;

        }
        .box ul li{
            width: 120px;
            float: left;

            text-align: center;
        }
        .box ul li a {
            text-decoration: none;
            color: darkgray;
        }
        .box ul li:hover{
            background-color: gold;
        }
        .box ul li a:hover{
            background-color: white;
        }
        #rem{

            float: right;
            border: 1px;
            font-size: 20px;
            width: 200px;
            float: left;
            text-decoration: none;
            color: darkgray;
            text-align: center;
        }
        #rem:hover{
            background-color: gold;
            color: black;
        }
    </style>
</head>
<body>
<div class="box">
    <ul type="none">
        <li><a href="Adminhome.php">Home</a></li>
        <!---  <li><a href="menuAdmin.php">Menu</a></li>
          <li><a href="AdminOrder.php">Order</a></li>-->
        <li><a href="project.html">logout</a></li>

    </ul>
</div>
<br><br>
<h2 > Add & Remove Admins  </h2>
<form action="Adminhome.php" method="post">

    <table>
        <tr><td><br> </td>
        </tr><tr><td><br></td>
        </tr><tr><td> Email:</td>
            <td>
                <input type="text" name="TX1" id="TX1">
            </td>
            <td><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;</p></td>

            <td><table> <tr>
                        <td><input id="rem" type="submit" name="BUTTON1" value="    Add Admin     " ></td>
                    </tr><tr>
                        <td><input id="rem" type="submit" name="BUTTON2" value=" Remove Admin "></td>
                    </tr>
                </table>

            </td>
        </tr>
        <tr> <td><br> </td></tr>
        <tr> <td>Password:</td>
            <td>
                <input type="password" name="TX2" id="TX2">
            </td>
        </tr>
        <tr>

        </tr>

    </table>
</form>
<script>

</script>
</body>
</html>