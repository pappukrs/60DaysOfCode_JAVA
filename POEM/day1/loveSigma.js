// Maine to kisi ki parwah nahi ki,
// Bina Kisi ki parwah kiye aage badhte chala gya
// Pyar tha JavaScript jaisa usse, function ka junoon,

const loveForHer = () => {
    let passion = "Her, like JavaScript";
    let dedication = true;

    // Promises banaye, phir bhi resolve na hui.
    let unfulfilledPromise = new Promise((resolve, reject) => {
        reject("Woh chali gayi, resolve na hui...");
    });

    unfulfilledPromise.catch(error => {
        console.log(error); // Output: Woh chali gayi, resolve na hui...
    });

    // Variables mein emotions rakh diye,
    let emotions = {
        love: "Unconditional, like her smile",
        effort: "Always 110%, because she's worth it",
        patience: "Infinite, like waiting for her reply",
        trust: "As strong as a secure connection",
        memories: "Moments spent with her, forever cached in my heart"
    };

    // Loops mein sapne saje the pure,
    for (let dream of ["future together", "happiness", "peace"]) {
        console.log(`Sapna: ${dream}`);
    }

    // Phir bhi woh chali, syntax ke pare,
    let lifeError = new Error("SyntaxError: Undefined emotions...");
    console.log(lifeError.message);

    // Error jaisa lagta hai ab yeh sab kuch.
    try {
        throw lifeError;
    } catch (e) {
        console.error("Error jaisa lagta hai:", e.message);
    }

    // Main coder hoon, express karta hoon functions mein,
    const expressFeelings = (feeling) => {
        console.log(`Coder ka ehsaas: ${feeling}`);
    };

    // Console.log karta hoon apni khushi aur gum,
    expressFeelings("Khushi: Jab uska message aata hai");
    expressFeelings("Gum: Jab woh offline ho jati hai");

    // Par uski yaad bhi ek comment ban kar,
    // Meri codebase mein kahin zinda hai ab tak.

    // Memories, local storage ki tarah save ho chuki,
    // Koi expiry nahi, rehengi zinda yahin kahi.
    localStorage.setItem("memoriesOfHer", "Woh to chali gayi par yaadein yahin rahein...");

    // TODO: Yahi yaadein meri codebase mein hamesha rahengi...
};

loveForHer();
