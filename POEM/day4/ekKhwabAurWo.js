const ekKhwabAurWo = () => {
    // Aaj dopahar ka sukoon
    let dopaharKaSukoon = "Soya tha, sapno mein kho gaya tha...";
    console.log(dopaharKaSukoon);

    // Wo sapne mein mere paas thi, har pal jaise raaz thi
    let sapneMeinWo = {
        saath: true,
        raaz: "Jaise ek chhupi hui kahani thi, par dil ke kareeb thi"
    };
    console.log(`Wo sapne mein thi, saath: ${sapneMeinWo.saath}, raaz: ${sapneMeinWo.raaz}`);

    // Phone ka awaaz ya message ka jhaaka, par kuch sunayi nahi diya
    let incomingCallOrMessage = new Promise((resolve) => {
        setTimeout(() => {
            resolve("Phone ka awaaz ya ek message ka jhaaka, par sapno mein dooba tha...");
        }, 2000); // 2 seconds delay
    });

    incomingCallOrMessage.then(response => {
        console.log(response); // Output: Phone ka awaaz ya ek message ka jhaaka...
    });

    // Status ka ek naya qissa, tasveer thi, chehra chhupa tha
    let uskaStatus = [
        { image: "firstImage.jpg", chehraChhupa: true, hasi: false },
        { image: "secondImage.jpg", chehraChhupa: false, hasi: true },
        { image: "thirdImage.jpg", chehraChhupa: true, hasi: true }
    ];

    uskaStatus.forEach((status, index) => {
        if (status.chehraChhupa) {
            console.log(`Tasveer ${index + 1}: Chehra chhupa tha, jaise apni kahani chhupa rahi thi.`);
        } else {
            console.log(`Tasveer ${index + 1}: Thoda chehra dikh raha tha, lekin hasi dil se thi.`);
        }
    });

    // Us tasveer mein thodi bechaini thi, par hasi sach thi
    let bechainiAurHasi = (status) => {
        if (status.beChaini && status.hasi) {
            console.log("Tasveer mein thodi bechaini thi, par uski hasi dil se thi.");
        } else if (status.hasi) {
            console.log("Tasveer mein uski hasi sach thi, musibat mein bhi.");
        }
    };

    bechainiAurHasi({ beChaini: true, hasi: true });

    // Phir ek aur tasveer, chehra phir chhup gaya
    const finalImageCheck = uskaStatus[2].chehraChhupa
        ? "Phir chehra chhup gaya, jaise apni duniya se door ho gayi."
        : "Chehra dikh raha tha, par sapne jaise sacche.";
    
    console.log(finalImageCheck);

    // Ek pal ki muskaan, jo sapno se bhi zyada sacchi thi
    setTimeout(() => {
        console.log("Wo muskaan, jo sapno se bhi zyada sacchi thi...");
    }, 4000); // After 4 seconds
};

ekKhwabAurWo();
