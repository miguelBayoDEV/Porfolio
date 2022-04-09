select distinct m.menu_nombre
from menus AS m
inner join menus_platos AS mp
on m.menu_id = mp.menu_id and mp.mp_tipo = "primero"
inner join platos AS p
on mp.plato_id = p.plato_id and p.plato_cuchara = true
order by m.menu_nombre ASC;