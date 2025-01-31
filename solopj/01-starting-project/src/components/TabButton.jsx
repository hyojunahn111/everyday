/*방법1*/
/*
export default function TabButton(props){
    return (
    <li>
        <button>{props.children}</button>
    </li>
    );
}*/

/*방법2*/
export default function TabButton({children, onSelect, isSelected}){
    console.log('TabBT COMPOENET EXECUTING');


    return (
        <li>
            <button className={isSelected ? 'active' : undefined} onClick={onSelect}>{children}</button>
        </li>
    );
}