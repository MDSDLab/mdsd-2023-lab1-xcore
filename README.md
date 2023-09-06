# Metamodell készítése a WebTest nyelvhez

A laborfeladat célja a [WebTest nyelv](docs/WebTestLanguageSpecification.md) metamodelljének kialakítása. Ez adja az alapját a később megvalósítandó fordítónak és kódgenerátornak.

A metamodell elkészítése során objektum-orientált módon kell megtervezni egy olyan UML osztálydiagram-szerű modellt, amely képes a WebTest nyelv minden elemét reprezentálni.

A metamodell kitalálása is lehetne egy önálló laborfeladat, de az egységesség és az automatizált tesztelhetőség kevéért megadjuk az általunk megtervezett metamodell grafikus reprezentációját UML osztálydiagram formájában. [Ezt a grafikus reprezentációt](docs/MetaModel.md) kell a laborfeladat során leképezni Xcore reprezentációra.

A WebTest nyelv [közös részét](docs/WebTestReference.md) mindenkinek meg kell valósítania. A [bővítmények](docs/WebTestReferenceExtra.md) közül csak a kiosztott 2 darab bővítményt kell kötelezően támogatni, a többi bővítmény támogatása opcionális.

## Laborfeladat

A laborfeladat elvégzéséhez nyissuk meg a **webtest.model** és **webtest.model.tests** projekteket Eclipse alatt! A **webtest.model** projekten belül a **model/webtest.xcore** fájlban kell dolgozni, ide kell beírni a metamodell Xcore reprezentációját.

Hasznos linkek az Xcore használatához:

* [Xcore Wiki](https://wiki.eclipse.org/Xcore)
* Az előző féléves Xtext-Xtend gyakorlat [útmutatója](docs/images/GY4-XtextXtend-Utmutato.pdf)
* Az Xcore operációk belsejében Xbase kifejezések használhatók. Az Xtend nyelv is Xbase kifejezéseket használ, így az Xbase nyelv referenciájaként leginkább a következő oldal szolgálhat: [Xtend Expressions](https://eclipse.dev/Xtext/xtend/documentation/203_xtend_expressions.html)

## Ellenőrzés

A **webtest.model.tests** projekt azt teszteli, hogy az elkészített Xcore metamodell megfelel-e a kiadott osztálydiagramoknak. A projektben az alábbi JUnit tesztosztályok szerepelnek:

* **MetaModelTests**: a közös metamodell leképzését ellenőrzi
* **BasePagesTests**: a **BasePages** nevű bővítmény leképzését ellenőrzi
* **CaptureTests**: a **Capture** nevű bővítmény leképzését ellenőrzi
* **ForEachTests**: a **ForEach** nevű bővítmény leképzését ellenőrzi
* **JavaScriptTests**: a **JavaScript** nevű bővítmény leképzését ellenőrzi
* **ManualTests**: a **Manual** nevű bővítmény leképzését ellenőrzi
* **TestParamsTests**: a **TestParams** nevű bővítmény leképzését ellenőrzi

A bővítményeket tesztelő osztályokból csak azokat kell megtartani, amelyek a kiosztott 2 darab bővítményt tesztelik, a többi bővítményt tesztelő osztály belseje kikommentezhető.

A **MetaModelTests** osztályt és belsejét mindenképpen meg kell tartani.

A WebTest metamodell leképzése és így a laborfeladat megoldása akkor tekinthető sikeresnek, ha az összes releváns teszt sikeresen le tud futni. Azonban a laborfeladat megoldásának alaposabb kiértékeléséhez a itt szereplő (előre kiadott) teszteken túl további tesztek is futtatásra kerülnek leadás után!

