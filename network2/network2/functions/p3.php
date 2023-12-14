<?php
$ip = "127.0.0.1:161";
$a = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.2");
$b = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.3");
$c = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.4");
$i =0;
foreach ($a as $k=>$val) {
    echo $i."  ".$val."     "
        .$a[$i]."   "
        .$b[$i]."   "
        .$c[$i]."   "
        ."\n";
        $i++;
}
?>