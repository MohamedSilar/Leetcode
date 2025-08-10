# Write your MySQL query statement below
select s.student_id,s.student_name ,su.subject_name,count(e.subject_name)attended_exams
from Students s
cross join 
Subjects as su
left join Examinations as e on e.student_id = s.student_id And su.subject_name = e.subject_name
group by
s.student_id , s.student_name , su.subject_name 
order by
s.student_id , s.student_name;