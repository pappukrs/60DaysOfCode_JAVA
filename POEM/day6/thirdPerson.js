const love = true;
const myHeart = '💔';
const herChoice = 'thirdPerson';
let emotions = [];

function whenYouLoveSomeone() {
    if (love && herChoice === 'thirdPerson') {
        emotions.push('Pain', 'Sadness', 'Tears');
        console.log(`
            When you love someone deeply, 
            And her heart wanders to another, 
            It shatters like a fragile dream, 
            Leaving you broken and cold as winter. 
            
            Every beat aches, every thought burns, 
            Watching her smile for someone else. 
            You fall into shadows where the sun no longer turns, 
            Love once bright, now a story untold by yourself.

            ${myHeart} beats heavy, a silent scream, 
            Yet hope lingers in the softest whisper. 
        `);
    } else {
        emotions.push('Hope');
        console.log('Maybe love will heal again...');
    }
}

whenYouLoveSomeone();
