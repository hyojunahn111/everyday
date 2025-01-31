import { useState } from 'react';

import reactImg from './assets/react-core-concepts.png'
import { CORE_CONCEPTS } from "./data.js";
import Header from './components/Header/Header.jsx'
import CoreConcept from './components/CoreConcept.jsx'
import TabButton from "./components/TabButton.jsx";
import { EXAMPLES } from "./data.js";


function App() {
    const [ selectedTopic, setSelectedTopic ]= useState();

    function handleClick(selectedButton){
        setSelectedTopic(selectedButton)
        console.log(selectedTopic);
    }

    console.log('APP COMPOENET EXECUTING');

    return (
        <div>
            <Header />
            <main>
                <section id="core-concepts">
                    <h2>Core Concepts</h2>
                    <ul>
                        {CORE_CONCEPTS.map((conceptItem) => (
                            <CoreConcept key={conceptItem.title} {...conceptItem} />
                        ))}
                        {/*<CoreConcept
                            title={CORE_CONCEPTS[0].title}
                            description={CORE_CONCEPTS[0].description}
                            image={CORE_CONCEPTS[0].image}
                        />
                        <CoreConcept {...CORE_CONCEPTS[1]}/>
                        <CoreConcept {...CORE_CONCEPTS[2]}/>
                        <CoreConcept {...CORE_CONCEPTS[3]}/>*/}
                    </ul>
                </section>
                <section id="examples">
                    <h2>Ex</h2>
                    <menu>
                        <TabButton isSelected={selectedTopic === 'components'} onSelect={() => handleClick('components')}>Components</TabButton>
                        <TabButton isSelected={selectedTopic === 'jsx'} onSelect={() => handleClick('jsx')}>JSX</TabButton>
                        <TabButton isSelected={selectedTopic === 'props'} onSelect={() => handleClick('props')}>Props</TabButton>
                        <TabButton isSelected={selectedTopic === 'state'} onSelect={() => handleClick('state')}>State</TabButton>
                    </menu>
                    {!selectedTopic ? (<p>topic을 선택해주세요</p>) :
                        (
                            <div id="tab-content">
                        <h3>{EXAMPLES[selectedTopic].title}</h3>
                        <p>{EXAMPLES[selectedTopic].description}</p>
                        <pre>
                            <code>
                                {EXAMPLES[selectedTopic].code}
                            </code>
                        </pre>
                    </div>
                        )
                    }

                </section>
            </main>
        </div>
    );
}

export default App;