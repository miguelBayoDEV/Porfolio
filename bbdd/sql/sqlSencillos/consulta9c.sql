select m.menu_nombre
from menus AS m
inner join menus_platos AS mp
on m.menu_id = mp.menu_id
inner join platos AS p
on mp.plato_id = p.plato_id and p.plato_calorias > 100;