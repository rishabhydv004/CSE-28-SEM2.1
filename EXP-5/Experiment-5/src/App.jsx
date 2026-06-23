import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Counter1 from '../components/Counter1'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Counter1/>
    </>
  )
}

export default App
