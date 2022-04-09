select p.plato_nombre
from platos AS p
inner join menus_platos AS mp
on p.plato_id = mp.plato_id and p.plato_calorias < 50
inner join menus AS m
on mp.menu_id = m.menu_id and m.menu_nombre IN ("lunes normal", "lunes especial");