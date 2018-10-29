
select s.*, c.name as className from student s full join class c on s.class_id = c.id order by s.id

select name from student where class_id = 2
UNION all
select name from class where id = 1


select id, name into student3 from student;

drop table student3

