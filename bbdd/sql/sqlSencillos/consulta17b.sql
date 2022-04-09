select mp.mp_tipo, AVG(p.plato_calorias) AS mediaCalorias
from menus_platos AS mp
inner join platos AS p
on mp.plato_id = p.plato_id
group by p.plato_calorias
order by mediaCalorias ASC;