import { useState } from 'react';
import { emoji as initialEmoji } from "./data.js";
import Header from "./components/Header/Header.jsx";
import Emoji from './components/emoji.jsx';

function App() {
    const [emojis, setEmojis] = useState(initialEmoji);

    const handleClick = (title) => {
        console.log(`${title} 이모지를 클릭했습니다!`);
        setEmojis(prevEmojis =>
            prevEmojis.map(emoji =>
                emoji.title === title ? { ...emoji, count: emoji.count + 1 } : emoji
            )
        );
    };

    return (
        <div>
            <Header />
            <main>
                <section>
                    <ul>
                        {emojis.map((emoji) => (
                            <li id='emojili' key={emoji.title}>
                                <Emoji onClick={() => handleClick(emoji.title)} {...emoji} count={emoji.count} />
                            </li>
                        ))}
                    </ul>
                </section>
            </main>
        </div>
    );
}

export default App;
