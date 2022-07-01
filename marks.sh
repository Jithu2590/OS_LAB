echo "Enter Marks of first subject "
read s1
echo "Enter Marks of second subject "
read s2
echo "Enter Marks of third subject " 
read s3
sum=$((s1+s2+s3))
avg=$((sum/3))
echo "Sum of Three Subjects : $sum"
echo "Average of Three Subjects : $avg"
if [ $avg -ge 90 ]
then
	grade='A'
elif [ $avg -ge 80 ]
then 
	grade='B'
elif [ $avg -ge 70 ]
then
	grade='C'
elif [ $avg -ge 60 ]
then
	grade='D'
else
	grade='E'
fi
echo "Grade : $grade"

Ouput:
Enter Marks of first subject 
80
Enter Marks of second subject 
90
Enter Marks of third subject 
70
Sum of Three Subjects : 240
Average of Three Subjects : 80
Grade : B

