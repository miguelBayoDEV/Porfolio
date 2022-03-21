select p.plato_nombre, m.menu_nombre, mp.mp_tipo
from platos AS p, menus AS m, menus_platos AS mp
where p.plato_id = mp.plato_id and m.menu_id = mp.menu_id
group by mp.plato_id
having m.menu_nombre in ('lunes normal', 'lunes especial')
order by m.menu_id DESC, mp.mp_tipo, p.plato_calorias;