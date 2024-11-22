function badKarnaKaTadka() {
    let man = "bechain"; // Heart restless
    let soch = "kya hoga agar..."; // What if...
    console.log(`Dil ke kone mein ek soch: "${soch}"`);

    // The moment of mischief
    const kaam = () => "thoda badmashi, thoda majaak"; 
    let kyaHua = kaam();
    console.log(`Ki gaya kaam: "${kyaHua}"`);

    // Immediate reaction
    const dostReaction = (dost) => 
        dost === "bff" ? "Kya mast tha, bro!" : "Pagal hai kya tu?!";
    console.log(dostReaction("bff"));

    // The guilt creeps in
    let guiltMeter = Math.floor(Math.random() * 10); 
    if (guiltMeter > 5) {
        console.log("Arrey yaar, shayad galat kiya...");
    } else {
        console.log("Koi na, zindagi hai, masti chalta hai!");
    }

    // Moral of the story
    let seekh = guiltMeter > 5 
        ? "Agli baar soch ke kaam karna." 
        : "Life mein spice zaruri hai!";
    console.log(`Moral of the story: "${seekh}"`);
    return seekh;
}

console.log(badKarnaKaTadka());
