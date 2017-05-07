<h1>Where's Vlado</h1>

<h2>Opis zadatka:</h2>

<p>
Kreirajte aplikaciju pod nazivom „Gdje je {vaše_ime}?“. Aplikacija treba korištenjem
lokacije na karti prikazati trenutni položaj korisnika markerom. Osim prikaza karte,
aplikacija na sučelju treba ispisati lokaciju, adresu, grad i zemlju u kojoj se korisnik
nalazi. Omogućiti postavljanje markera drugačije ikone na kartu, prilikom dodavanja
markera pustiti zvuk preko SoundPool klase. Omogućiti slikanje klikom na gumb pri
čemu se slika sprema na uređaj, ime se zadaje pomoću trenutne lokacije, a korisniku se
šalje notifikacija klikom na koju se otvara ta slika u galeriji. Zapakirajte i potpišite
aplikaciju ključem u trajanju od 50 godina.
</p>

<h2>Rješavanje zadatka i problemi:</h2>

<p>
<h4>Osvrt na zadatak i korištena rješenja:</h4>
<p>
Aplikacija Where's Vlado služi za pronalaženje trenutne lokacije korisnika, dodavanje različitih markera sa zvukom i slikanje s te lokacije.
Za izradu rješenja ove aplikacije najviše je korišten predložak za peptu laboratorijsku vježbu [1] i rješenja za korištenje kamere pronađena na 
linkovima [2] [3] [4] [5] [6]. Klikom na kartu postavlja se marker i korištenjem sound pool klase čuje se zvuk. 
Klikom na gumb otvara se novi implicitni intent koji pokreće kameru, a nakon što je slikana slika korinik je upitan želi li spremiti tu sliku ili ne, te želi li uslikati opet.
Ispod gumba i iznad map fragmenta se nalazi text view u kojem pišu podaci na kojoj se korisnik nalazi.
</p>

<h4>Testiranje:</h4>
Testiranje je izvršeno na Alcatel popStar i Noa VivoSe uređajima.
</p>

<p>
<h4>Problemi:</h4>
<p>
Jedini vidljiv problem koji se pojavio u aplikaciji koji nije dopuštao normalan rad aplikacije riješen je manipulacijom manifest datoteke [7].
Također se pojavio i problem ne mogućnosti nalaženja trenutne lokacije prilikom korištenja Noa VivoSE pametnog telefona, no ovo nije bilo moguće rješiti u kodu
jer sam uređaj ima grešku i korištenjem normalnih Google mapa ne može pronaći trenutnu lokaciju.
</p>
</p>

<h1>Sources</h1>
 <ul type="none">
  <li>[1] Predlošci za laboratorijske vježbe</li>
  <li>[2] http://stackoverflow.com/questions/14154104/how-to-take-a-photo-save-it-and-get-the-photo-in-android</li>
  <li>[3] http://stackoverflow.com/questions/5991319/capture-image-from-camera-and-display-in-activity</li>
  <li>[4] http://stackoverflow.com/questions/32624133/how-to-take-a-screen-shot-on-a-button-click-can-anyone-provide-a-android-code</li>
  <li>[5] http://stackoverflow.com/questions/23123767/notification-pressed-to-open-up-file-in-default-app-android</li>
  <li>[6] http://stackoverflow.com/questions/2661536/how-to-programmatically-take-a-screenshot-in-android</li>
  <li>[7] http://stackoverflow.com/questions/38714651/android-studio-dexindexoverflowexception-method-id-not-in</li>
</ul> 
