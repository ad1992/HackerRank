#!/bin/bash
read ch
if( [[ $ch = 'y' ]] || [[ $ch = 'Y' ]] );
then
echo "YES"
else
echo "NO"
fi
