select plato_nombre, plato_calorias
from platos
where plato_calorias = (select MAX(plato_calorias) AS maxCalorias from platos);