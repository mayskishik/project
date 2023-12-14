<?php
$tcp_con_state= snmp2_walk("127.0.0.1","public",".1.3.6.1.2.1.6.13.1.1");
$conn_local_addrs= snmp2_walk("127.0.0.1","public",".1.3.6.1.2.1.6.13.1.2");
$conn_local_port= snmp2_walk("127.0.0.1","public",".1.3.6.1.2.1.6.13.1.3");
$conn_remote_addrs= snmp2_walk("127.0.0.1","public",".1.3.6.1.2.1.6.13.1.4");
$conn_remote_port= snmp2_walk("127.0.0.1","public",".1.3.6.1.2.1.6.13.1.5");


if ( isset( $_GET['api'] ) )
{
    $i = 0;
    foreach($tcp_con_state as $obj){
        echo $i."  ".$obj."     "
            .$conn_local_addrs[$i]."     "
            .$conn_local_port[$i]
            ."     "
            .$conn_remote_addrs[$i]
            ."     ".$conn_remote_port[$i].
            "\n";
        $i++;
    }
}
?>
