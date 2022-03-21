select distinct p.plato_nombre, mp.mp_tipo
from platos AS p, menus_platos AS mp
where p.plato_id = mp.plato_id;