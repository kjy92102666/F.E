SET TRANSACTION NAME 'T1';      -- T1�̶�� ������ �����Ѵ�~
-- �������� ������Ʈ�� ���? ��?. �ݺ�����.

UPDATE Book 
SET     price=price+100
WHERE  bookid=1;

select bookid, price from book;

UPDATE Book 
SET     price=price+100
WHERE  bookid=2;
commit;uuuuuuuuuuuuuuuuuuuu
