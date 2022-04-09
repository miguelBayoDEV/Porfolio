select m.menu_nombre, p.plato_nombre, SUM(p.plato_calorias) AS maximoCalorias
from menus AS m
inner join menus_platos AS mp
on m.menu_id = mp.menu_id and m.menu_nombre in ("lunes normal", "lunes especial")
inner join platos AS p
on mp.plato_id = p.plato_id
group by p.plato_calorias;