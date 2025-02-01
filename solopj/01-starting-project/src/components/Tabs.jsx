export default function Tabs({children, buttons, buttonContainer}){
    return <>
        <menu>
            {buttons}
        </menu>
        {children}
    </>
}