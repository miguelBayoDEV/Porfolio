select p.plato_nombre, COUNT(i.plato_id) AS nIngredientesPlatos
from platos AS p
inner join ingredientes AS i
on p.plato_id = i.plato_id and i.ingrediente_nombre is not null or i.ingrediente_nombre is null
group by i.plato_id;