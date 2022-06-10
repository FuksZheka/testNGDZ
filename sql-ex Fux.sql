-------------------------------  SQL-ex.ru -------------------------------

---- Задание(запрос) №1 -----
SELECT pc.MODEL, pc.SPEED, pc.HD
FROM PC pc
WHERE PRICE < '500'

---- Задание(запрос) №2 -----
SELECT DISTINCT pr.MAKER
FROM Product pr
WHERE pr.type = 'Printer'

---- Задание(запрос) №3 -----
SELECT l.MODEL, l.RAM, l.SCREEN
FROM LAPTOP l
WHERE l.PRICE > 1000


---- Задание(запрос) №4 -----
SELECT *
FROM PRINTER pr
WHERE pr.COLOR = 'y' 

---- Задание(запрос) №5 -----
SELECT pc.MODEL, pc.SPEED, pc.HD
FROM PC pc
WHERE pc.CD IN ('12x', '24x')
AND pc.PRICE < 600


---- Задание(запрос) №6 -----
SELECT DISTINCT p.MAKER, l.SPEED
FROM PRODUCT p JOIN LAPTOP l
ON p.MODEL = l.MODEL
WHERE l.hd >=10

---- Задание(запрос) №7 -----
SELECT p.model, pc.price
FROM Product p, PC pc
WHERE p.model=pc.model
AND maker='B'
UNION

SELECT p.model, pr.price
FROM Product p, printer pr
WHERE p.model=pr.model
AND maker='B'
UNION

SELECT p.model, l.price
FROM Product p, laptop l
WHERE p.model=l.model
AND maker='B'

---- Задание(запрос) №8 -----
SELECT DISTINCT p.maker
FROM product p
WHERE p.type='PC' 
AND p.maker NOT IN (SELECT p2.maker
                    FROM product p2
                    WHERE p2.type = 'Laptop')


---- Задание(запрос) №9 -----
SELECT DISTINCT p.MAKER
FROM PRODUCT p, PC pc
WHERE pc.speed >= 450
AND pc.model = p.model

---- Задание(запрос) №10 -----
SELECT pr.MODEL, pr.PRICE
FROM Printer pr
WHERE pr.PRICE = (SELECT MAX(PRICE) FROM PRINTER)

---- Задание(запрос) №11 -----
SELECT AVG(speed)
FROM PC

---- Задание(запрос) №12 -----
SELECT AVG(l.SPEED)
FROM LAPTOP l
WHERE l.PRICE > 1000

---- Задание(запрос) №13 -----
SELECT AVG(pc.SPEED)
FROM PC pc, Product pr
WHERE pc.MODEL IN (SELECT pr2.MODEL 
                   FROM Product pr2
                   WHERE pr2.Maker = 'A')

---- Задание(запрос) №14 -----
SELECT sh.class, sh.name, cl.country
FROM Ships sh, Classes cl
WHERE sh.class = cl.class AND cl.numGuns >= 10

---- Задание(запрос) №15 ----- 
SELECT DISTINCT pc.hd 
FROM PC pc
WHERE EXISTS(SELECT *
             FROM PC pc2
             WHERE pc2.code != pc.code AND pc2.hd = pc.hd)

---- Задание(запрос) №16 -----
SELECT DISTINCT pc.model, pc2.model, pc.speed, pc.ram
FROM PC pc, PC pc2
WHERE pc.speed = pc2.speed 
AND pc.ram = pc2.ram
AND pc.model > pc2.model

---- Задание(запрос) №17 -----
SELECT DISTINCT p.type, l.model, l.speed
FROM Laptop l, Product p
WHERE l.speed < ALL(SELECT pc.speed FROM PC pc) 
AND p.type = 'Laptop'

---- Задание(запрос) №18 -----
SELECT DISTINCT pr.maker, prin.price
FROM Product pr, Printer prin
WHERE pr.model = prin.model 
AND prin.color = 'Y' 
AND prin.price = (SELECT MIN(printer.price)
                  FROM Printer printer
                  WHERE printer.color = 'Y')

---- Задание(запрос) №19 -----
SELECT pr.maker, AVG(l.screen)
FROM Product pr, Laptop l
WHERE pr.type = 'Laptop'
AND pr.model = l.model
GROUP BY pr.maker

---- Задание(запрос) №20 -----
SELECT pr.maker, COUNT(pr.model)
FROM Product pr
WHERE pr.type = 'PC'
GROUP BY pr.maker
HAVING COUNT(pr.model) >= 3

---- Задание(запрос) №21 -----
SELECT pr.maker, MAX(pc.price)
FROM Product pr, Pc pc
WHERE pc.model IN (SELECT pr.model 
				   FROM Product pr2
				   WHERE pr2.type = 'PC')
GROUP BY pr.maker

