import React, { useState } from 'react';
import axios from 'axios';

function SummaryEnhancer() {
  const [input, setInput] = useState('');
  const [result, setResult] = useState('');

  const handleEnhance = async () => {
    try {
      const res = await axios.post('http://localhost:8080/enhance-profile', {
        headline: input.trim(),
      });
      setResult(res.data.enhancedHeadline);
    } catch (err) {
      console.error('Error enhancing:', err);
      setResult('❌ Failed to enhance headline.');
    }
  };

  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial' }}>
      <h1>LinkedIn Headline Enhancer</h1>
      <input
        type="text"
        value={input}
        onChange={e => setInput(e.target.value)}
        placeholder="Enter your role (e.g., Backend Developer)"
        style={{ width: '300px', padding: '0.5rem' }}
      />
      <button onClick={handleEnhance} style={{ marginLeft: '1rem', padding: '0.5rem 1rem' }}>
        ✨ Enhance
      </button>

      {result && (
        <div style={{ marginTop: '2rem', fontSize: '1.2rem', color: 'green' }}>
          <strong>Suggested Headline:</strong><br />
          {result}
        </div>
      )}
    </div>
  );
}

export default SummaryEnhancer;
