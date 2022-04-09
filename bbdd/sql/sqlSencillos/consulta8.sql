select m.menu_nombre
from menus AS m, menus_platos AS mp, platos AS p
where m.menu_id = mp.menu_id and mp.plato_id = p.plato_id and p.plato_nombre = "paella";