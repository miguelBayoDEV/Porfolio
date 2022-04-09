select menus.menu_nombre
from menus, menus_platos, platos
where menus.menu_id = menus_platos.menu_id and menus_platos.plato_id = platos.plato_id and platos.plato_calorias > 100;