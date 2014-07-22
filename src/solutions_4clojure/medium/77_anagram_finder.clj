(defn anagram-finder [words]
  (letfn [(is-anagram [w1 w2] (= (sort w1) (sort w2)))
          (anagram-find [w words] (filter
                                   #(is-anagram w %)
                                   words))]
  (set (filter #(> (count %) 1) (map #(set (anagram-find % words)) words)))))

(= (anagram-finder ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}})

(= (anagram-finder ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})
