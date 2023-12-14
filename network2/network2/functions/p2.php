<?php
$ip= "127.0.0.1";
$ip_addr_table = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20");
$IpAdEntAddr = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.1");
$IpAdEnIfIndex = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.2");
$ipEntNetMask = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.3");
$ipAdEntBcastAddr = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.4");
$ipAdEntReasmMaxSize = snmp2_walk($ip,"public",".1.3.6.1.2.1.4.20.1.5");
$i=0;
foreach($IpAdEntAddr as $obj){
    echo $i."  ".$obj."     "
        .$IpAdEntAddr[$i]."     "
        .$IpAdEnIfIndex[$i]."     "
        .$ipEntNetMask[$i]."     "
        .$ipEntNetMask[$i]."    "
        .$ipAdEntBcastAddr[$i]."    "
        .$ipAdEntReasmMaxSize[$i]."\n";
    $i++;
}
?>