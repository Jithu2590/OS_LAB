#!/bin/bash
echo "Enter the marks of the student"
read marks
if [ $marks -gt 90 ] && [ $marks -le 100 ]
then
        echo "Grade A"
elif [ $marks -gt 80 ] && [ $marks -le 90 ]
then
        echo "Grade B"
elif [ $marks -gt 70 ] && [ $marks -le 80 ]
then
        echo "Grade C"
elif [ $marks -gt 60 ] && [ $marks -le 70 ]
then
        echo "Grade D"
elif [ $marks -gt 50 ] && [ $marks -le 60 ]
then
        echo "Grade E"
elif [ $marks -gt 40 ] && [ $marks -le 50 ]
then
        echo "Grade F"
else
        echo "FAIL"
fi 
