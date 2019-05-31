select 
case mod(number,2) WHEN 0 then 'Even'
else 'Odd' 
END "is_even" 
from  numbers;