import './emoji.css'

export default function Emoji(props){
    return(
        // eslint-disable-next-line react/prop-types
        <div id="emojistlye" onClick={props.onClick}>
            <li>
                {/* eslint-disable-next-line react/prop-types */}
                <img src={props.image} alt={props.title}/>
                {/* eslint-disable-next-line react/prop-types */}
                <p>{props.count}</p>
            </li>
        </div>

    );
}