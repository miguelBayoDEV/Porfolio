select plato_nombre, plato_calorias
from platos
where plato_calorias = (select MIN(plato_calorias) AS maxCalorias from platos);