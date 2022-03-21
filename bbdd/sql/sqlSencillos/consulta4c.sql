select mp_tipo
from menus_platos
group by mp_tipo
order by mp_tipo ASC;

select distinct mp_tipo
from menus_platos
order by mp_tipo ASC;