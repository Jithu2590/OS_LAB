#!/bin/bash
echo enter basic salary
read sal
if [ $sal -le 1500 ]
then
        hra=$(echo "0.1*$sal"|bc)
        echo "The hra is : $hra"
        da=$(echo "0.9*$sal"|bc)
        echo "The da is : $da"
        gsal=$(echo "$hra+$da+$sal"|bc)
        echo "The gross salary : $gsal"
else
        hra=$(echo "500"|bc)
        echo "The hra is : $hra"
        da=$(echo "0.98*$sal"|bc)
        echo "The da is : $da"
        gsal=$(echo "$hra+$da+$sal"|bc)
        echo "The gross salary : $gsal"
fi

------------------------------------------------------------------------------------
echo "enter the basic salary:"
read bsal
if [ $bsal -lt 1500 ]
then
gsal=$((bsal+((bsal/100)*10)+(bsal/100)*90))
echo "The gross salary : $gsal"
fi
if [ $bsal -ge 1500 ]
then
gsal=$(((bsal+500)+(bsal/100)*98))
echo "the gross salary : $gsal"
fi
