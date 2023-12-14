<?php
    
    if(isset($_POST['location']))
        snmp2_set("127.0.0.1","public",".1.3.6.1.2.1.1.6.0","s", $_POST['location'] );
    
    if(isset($_POST['contact']))
        snmp2_set("127.0.0.1","public",".1.3.6.1.2.1.1.4.0","s",$_POST['contact']);

    if(isset($_POST['name']))
        snmp2_set("localhost","public","1.3.6.1.2.1.1.5.0","s",$_POST['name']);

    $sys_group = snmp2_walk("127.0.0.1","public",".1.3.6.1.2.1.1");

    if ( isset( $_GET['api'] )  ) 
    {
        foreach($sys_group as $val)
            echo "" . $val . "\n";
    }
    
?>