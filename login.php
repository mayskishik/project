<?php
session_start();
$mem = 0; //To check if he/she is a member or not
if (isset($_POST['as'])){
if (isset($_POST['ELog']) && isset($_POST['passLog'])) {
$_SESSION['ismember'] = 0;
$_SESSION['E']=$_POST['ELog'];
@$dp = new mysqli('localhost', 'root', '', 'newdb');
if (mysqli_connect_errno()) {
echo "Error in connection with data base";
die();
}
$strQry = 'select * from member';
$res = $dp->query($strQry);
for ($i = 0; $i < $res->num_rows; $i++) {
$row = $res->fetch_assoc();
if ($_POST['ELog'] == $row['email'] && $_POST['passLog'] == $row['password']) {
$_SESSION['ismember'] = 1;
$mem = 1;
header("location:project.html");
}
}
if ($mem == 0) {
echo '<p style="color: red ; position: relative ; left: 620px ; top: 395px;z-index: 5">incorrect email or password</p>';
}

}}

else if (isset($_POST['asa'])){
@$dp = new mysqli('localhost', 'root', '', 'newdb');
if (mysqli_connect_errno()) {
echo "Error in connection with data base";
die();
}
$strQry = 'select * from admins';
$res = $dp->query($strQry);
$f=0;
for ($i = 0; $i < $res->num_rows; $i++) {
$row = $res->fetch_assoc();
if ($_POST['ELog'] == $row['email'] && $_POST['passLog'] == $row['password']) {
$f=1;
header("location:Adminhome.php");
}

}
if ($f == 0) {
echo '<p style="color: red ; position: relative ; left: 620px ; top: 395px;z-index: 5">incorrect email or password</p>';

}

}


?>




