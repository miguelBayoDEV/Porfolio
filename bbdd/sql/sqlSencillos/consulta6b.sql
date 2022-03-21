select p.plato_nombre, m.menu_nombre, mp.mp_tipo
from platos AS p, menus AS m, menus_platos AS mp
where p.plato_id = mp.plato_id and m.menu_id = mp.menu_id
order by p.plato_calorias;