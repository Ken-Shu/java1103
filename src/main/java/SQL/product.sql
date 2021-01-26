--select * from total
--計算總金額
select sum(d.PRICE*d.AMOUNT) as subtotal
from DRINK d
order by subtotal;

-- 建立動態小計欄位
select d.ID , d."NAME" , d.PRICE , d.AMOUNT , d.PRICE*d.AMOUNT as subtotal
from DRINK d;


--利用 where 限制式
select d.ID , d."NAME" , d.PRICE , d.AMOUNT 
from DRINK d
where d.amount >= 10 and d.PRICE>= 50;
