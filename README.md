# scarsello
Milestone 1
Gesualdo Fabrizio
Francese samuele
La Monica Brayan Stiven
Leggio Salvatore


Brain storming:
abbiamo deciso di utilizzare come parola centrale del brainstorming scacchi per mettere in conto più fattori possibili, ovviamente dato che ci è stata commissionata solo la creazione del bishop (alfiere) abbiamo escluso tutte le parole superflue.
Le parole che ci sono state utili per sviluppare riflessioni sono state:
posizione
scacchiera
mossa
muoversi
problemi
mangiare
vincere
essere mangiati
controllo
suggerimenti
errori
regole
aiuti


Il brainstorming ci ha consentito di eseguire un dibattito più veloce e specifico, senza discussioni inutili

Dibattito:
Per il dibattito ci è bastato far spiegare a chi aveva detto qualche parola durante il brainstorming come e perchè l’aveva collegata agli scacchi, da qui sono nati degli spunti utili;

gli scacchi hanno come base la scacchiera:
ci siamo resi conto che di fatto la scacchiera è una tabella con le coordinate e che il primissimo passaggio da fare per iniziare il programma è quello di trovare un modo per registrare la posizione di ogni singolo pezzo all’interno di questa tabella.
Ci siamo anche chiesti come trasformare una coordinata espressa in lettere in numeri per renderla utilizzabile durante la programmazione.


L’utente può sbagliare:
in questo dibattito abbiamo cercato di capire cosa l’utente può sbagliare e quali controlli si possono lasciare da parte.
Abbiamo deciso che, anche se aumenterà la complessità del programma e le dimensioni, assolutamente nessun controllo può essere avallato, questo perchè l’utente può fare molteplici errori, è quindi necessario che oltre ad un prezioso controllo di errori l’utente deve essere guidato, se lo desidera, nell’inserimento delle mosse.

Aiutare l’utente:
Ci siamo divisi in due in questo dibattito.
la metà di noi aveva come idea quella di guidare l’utente dall’inizio alla fine della partita, “obbligandolo” a inserire le mosse giuste, ossia non facendogli inserire la mossa ma costringendolo a scegliere una delle mosse proposte dal programma.
l’altra metà invece proponeva un approccio molto più libero, l'utente veniva guidato solo a inizio programma, proponendo di utilizzare impegno e memoria per eseguire controlli sull'inserimento Mosse



Movimento dell'alfiere:
Per quanto riguarda il movimento del bishop, tutti eravamo già a conoscenza del fatto che questo si muove solo in orizzontale e non può saltare le pedine
Tuttavia abbiamo dovuto pensare a come farlo muovere sulla tabella.
In questo caso il termine orizzontale doveva esser tradotto in una differenza o somma di coordinate ossia:
Ogni pezzo si può muovere con uno schema fisso, la differenza tra le coordinate iniziali e quelle finali ha delle caratteristiche specifiche.
Nel caso dell'Alfieri la differenza tra la y iniziale e la y finale e la differenza tra la x iniziale e la x finale (entrambe dentro valore assoluto) deve essere uguale.












	
