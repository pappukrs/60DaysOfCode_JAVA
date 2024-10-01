// Maine to kisi ki parwah nahi ki,
// Bina Kisi ki parwah kiye aage badhte chala gya
// Pyar tha JavaScript jaisa usse, function ka junoon,

const loveForHer = () => {
    let passion = "JavaScript";
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
        love: "JavaScript",
        effort: 100
    };

    // Loops mein sapne saje the pure,
    for (let dream of ["success", "perfection", "joy"]) {
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
    expressFeelings("Khushi: Jab code chalta hai");
    expressFeelings("Gum: Jab woh exception throw karti hai");

    // Par uski yaad bhi ek comment ban kar,
    // Meri codebase mein kahin zinda hai ab tak.
    // TODO: Yahi yaadein meri codebase mein hamesha rahengi...
};

loveForJS();
