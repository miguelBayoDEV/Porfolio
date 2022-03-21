select plato_nombre, ingrediente_nombre
from platos AS p, ingredientes AS i
where p.plato_id = i.plato_id;