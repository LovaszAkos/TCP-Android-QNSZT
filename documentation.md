Amikor becsatlakoztunk elénk állították a következő problémákat:
-Van arduino-nk, ahhoz vezérlő program, mérnek a szenzorok, és azokról adatot szolgáltatnak. A korábbi csapat megoldotta egy Python kóddal, hogy a szenzorok csak az adatokat szolgáltassák binárisan, majd amelyik gépen gyűjtik, ott lefut a .py és emberileg érthetőre átkódolja az adat folyamot.
Viszont, mindezek ellenére (mint később kiderült, a mobil app, és az MQTT protocoll miatt) delay van az indításban. És az UMQTT szerver csak 5 készüléket enged felcsatlakoztatni.
Fizikai javítások a szenzorokon.

Ezekre következő képpen reagáltunk:
- Megkaptuk az instrukciókat, új lendületet vittünk a csapat munkájába. 
- Saját TCP szerverünk van androidra, onnan üzemeltetjük a komponenseket, így nincs késés se a pullolás miatt. Valós időben indulnak, és megrendelésnek megfelelően működnek.
- Valamint a mobil hotspot lehetőség miatt tudtuk bővíteni, így emeltük a csatlakozások számát 8ra. 
- Eltárolja a felhasználókat, egyszerre kezeljük a be- és kimenő adatokat. Fény visszajelzés, időbélyeges üzenetek, automatikus taggelés, és annak eltávolítása, valamint számolja a felhasználókat.
- A szinkronizálást és minden eszköz kezelését telefonról vezérelhetővé tettük.
- Közben folyamatosan teszteljük a mérő eszközök stabilitását, üzem idejét, ezzel egy időben kalibrálási folyamatok is futnak
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTkwNjMyODgzMV19
-->