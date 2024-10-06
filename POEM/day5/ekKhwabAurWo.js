const ekKhwabAurWo = () => {
    // Aaj raat, khwabon ka silsila
    let raatKeKhwab = "Wo bar bar mere khwabon mein aa rahi thi...";
    console.log(raatKeKhwab);

    // Main khud ko rok raha tha, sapno ko mitane ki koshish kar raha tha
    let sapnoKoDurKarneKiKoshish = new Promise((resolve) => {
        setTimeout(() => {
            resolve("Main khud ko rokne ki koshish kar raha tha, par wo khyal wapas aa rahe the...");
        }, 1500); // 1.5 seconds delay
    });

    sapnoKoDurKarneKiKoshish.then(response => {
        console.log(response); // Output: Main khud ko rokne ki koshish kar raha tha...
    });

    // Uska khyal baar baar aata, kaise hogi, kya kar rahi hogi
    let khyalUska = {
        dimaag: "Kaise hogi wo? Kya kar rahi hogi abhi?",
        callYaMsg: false
    };
    console.log(`Khyal: ${khyalUska.dimaag}, Call ya message: ${khyalUska.callYaMsg ? "kar sakta tha" : "mana kiya tha"}`);

    // Us cheater ki yaad aayi, jisne mana kiya tha call ya message karne se
    let cheaterYaad = new Promise((resolve) => {
        setTimeout(() => {
            resolve("Shayad us cheater ne mana kiya hoga, isliye usne mujhe roka...");
        }, 2500); // 2.5 seconds delay
    });

    cheaterYaad.then(response => {
        console.log(response); // Output: Shayad us cheater ne mana kiya hoga...
    });

    // Phir bhi, apne aap ko rok na paya
    let apnaMann = "Bahut try kiya apne aap ko rokne ka, par dil maan gaya nahi...";
    console.log(apnaMann);

    // Ek aur message, jo phir se chala gaya uske pass
    setTimeout(() => {
        console.log("Aur phir, ek aur message... Us khamoshi ko todne ki ek aur koshish.");
    }, 4000); // After 4 seconds
};

ekKhwabAurWo();
