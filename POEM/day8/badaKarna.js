function badKarna() {
    const guilt = [];
    const thrill = [];
    const realization = [];
    
    // Staring at the temptation
    let dil = "kya kare, kya na kare?";
    console.log(`Dil soch raha hai: "${dil}"`);

    // Decision moment
    if (Math.random() > 0.5) {
        console.log("Haan, karte hain kuch masti, kuch shaitani.");
        thrill.push("adrenaline rush");
    } else {
        console.log("Nahi yaar, sambhal ja, seedha raasta chuno.");
        guilt.push("better judgement");
        return "Bacha liya apne aap ko.";
    }

    // Doing the deed
    let karma = "thoda masti, thoda fasad";
    console.log(`Kiya kuch yeh: "${karma}"`);

    // The aftermath
    guilt.push("soch: galat kiya yeh?");
    realization.push("seekh: agli baar sudhar.");
    console.log(`Anjaam: ${guilt.join(", ")}, ${realization.join(", ")}`);

    // Lesson learned
    console.log("Zindagi ka yeh ek aur chapter ho gaya band.");
    return `Kya seekha? ${realization.join(", ")}`;
}

console.log(badKarna());
