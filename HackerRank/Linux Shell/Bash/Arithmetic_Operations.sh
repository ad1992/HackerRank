#!/bin/bash
read N
sum=0
for((i=1;i<=N;i++));
do
	read num
	sum=$((sum + num))
done
avg=$(echo "$sum/$N" | bc -l)
printf %.3f $avg
