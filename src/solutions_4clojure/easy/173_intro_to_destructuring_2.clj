; 173 - intro to destructuring 2
(= 3
   (let [[op arg] [+ (range 3)]] (apply op arg))
   (let [[[op arg] b] [[+ 1] 2]] (op arg b))
   (let [[op arg] [inc 2]] (op arg)))
